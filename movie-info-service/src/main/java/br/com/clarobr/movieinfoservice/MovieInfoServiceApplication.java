package br.com.clarobr.movieinfoservice;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

import br.com.clarobr.movieinfoservice.correlation.CorrelationHeaderFilter;

@SpringBootApplication
public class MovieInfoServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieInfoServiceApplication.class, args);
	}
	
	@Bean
    public FilterRegistrationBean<CorrelationHeaderFilter> correlationHeaderFilter() {
        FilterRegistrationBean<CorrelationHeaderFilter> filterRegBean = new FilterRegistrationBean<CorrelationHeaderFilter>();
        filterRegBean.setFilter(new CorrelationHeaderFilter());
        filterRegBean.setUrlPatterns(Arrays.asList("/*"));
        return filterRegBean;
    }

}

