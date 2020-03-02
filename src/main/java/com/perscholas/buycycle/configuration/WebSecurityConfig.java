/**
 * @author Andres Ramirez
 * File: WebSecurityConfig.java
 * Date 02/29/2020
 * 
 */

package com.perscholas.buycycle.configuration;

import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.perscholas.buycycle.service.UserDetailsServiceImpl;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter{

	//to prevent security from being applied to resources (css, img, js)

    String[] resources = new String[]{
            "/include/**","/css/**","/icons/**","/img/**","/js/**","/layer/**"
    };
	
    @Override
    protected void configure( HttpSecurity http ) throws Exception {
        	http
            .authorizeRequests()
	        .antMatchers( resources ).permitAll()  
	        .antMatchers( "/","/index" ).permitAll()
	        .antMatchers( "/admin*" ).access( "hasRole('ADMIN')" )
	        .antMatchers( "/user*" ).access( "hasRole('USER')or hasRole('ADMIN')" )
                .anyRequest().authenticated()
                .and()
            .formLogin()
                .loginPage( "/login" )
                .permitAll()
                .defaultSuccessUrl( "/menu" )
                .failureUrl("/login?error=true")
                .usernameParameter("username")
                .passwordParameter("password")
                .and()
            .logout()
                .permitAll()
                .logoutSuccessUrl("/login?logout");
    }
    BCryptPasswordEncoder bCryptPasswordEncoder;
    //Create password encryptor	
    
    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
		bCryptPasswordEncoder = new BCryptPasswordEncoder(4); 
		// Number 4 represents how strong you want encryption (4-31)
		//If you do not enter a number, the program will use one randomly each time
		//for encrypted passwords work
        return bCryptPasswordEncoder;
    }
	
    @Autowired
    UserDetailsServiceImpl userDetailsService;
	
    //Register the service for users and the password encrypted
    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception { 
 
        auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());     
    }	
}
