package com.demo.annotations2;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
//this class is used by spring to get bean this package when we request for bean than spring searches component in this package
@Configuration
@ComponentScan(basePackages="package com.demo.annotations2")
public class ConfigureAnno {

	public ConfigureAnno() {
}
	

}
