package com.demo.annotations2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Component
public class App {
	
	@Autowired
	@Qualifier("youTube")
	private Application application;
	public void show()
	 {
		application.showName();
		application.doubleTap();
		application.singleTap();
		 }
	public static void main(String[] args) {
		AnnotationConfigApplicationContext     context = new AnnotationConfigApplicationContext(ConfigureAnno.class);
		App app = context.getBean(App.class); 
		Application a = (Application) context.getBean("insta");
		app.show();
	}

}

 interface Application {
void showName();
void doubleTap();
void singleTap();
}


@Component("insta")
@Primary
 class Instagram implements Application{
	
	public Instagram() 
	{
		
	}
	public void showName() {
	System.out.println("App name is Instagram");	
	}
	public void doubleTap() {

		System.out.println("by tapping double you can like the post");
	}
	public void singleTap() {
		System.out.println("by tapping single you can mute the post");
	}
	
		}


@Component("youTube")
 class Youtube implements Application {
	
	public void Youtube() 
	{
		
	}
	public void showName() {
	System.out.println("App name is Youtube");	
	}
	public void doubleTap() {

		System.out.println("by tapping double you can zoom in zoom out the video");
	}
	public void singleTap() {
		System.out.println("by tapping single you can pause the video");
	}

	}

