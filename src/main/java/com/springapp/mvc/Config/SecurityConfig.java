package com.springapp.mvc.Config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.servlet.configuration.EnableWebMvcSecurity;

import javax.sql.DataSource;

@Configuration
@EnableWebMvcSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Autowired
	DataSource dataSource;
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth
			.jdbcAuthentication()
			.dataSource(dataSource)
			.usersByUsernameQuery(
					"select username, password, enabled " +
					"from USERS where username=?")
			.authoritiesByUsernameQuery(
					"select username, application_role from USERS where username=?");
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
			.csrf()
				.disable()
			.formLogin()
				.loginPage("/login")
				.defaultSuccessUrl("/")
				.usernameParameter("username")
				.passwordParameter("password")
				.failureUrl("/login?error")
			.and()
			.logout()
				.logoutSuccessUrl("/loggedout")
				.logoutUrl("/logout")
			.and()
			.httpBasic()
				.realmName("Library")
			.and()
			.rememberMe()
				.tokenValiditySeconds(604800)
				.key("libKey")
			.and()
			.authorizeRequests()
			// admin pages
				.antMatchers("/manage/**").hasRole("ADMIN")
				
			// authenticated pages
				.antMatchers("/profile/**").authenticated()
				.antMatchers("/add").authenticated()
				.antMatchers("/search**").authenticated()
				.antMatchers("/typo/**").authenticated()

			// other
				.anyRequest().permitAll();		
	}

}
