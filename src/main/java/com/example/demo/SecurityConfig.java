package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{
//   @Autowired
//   UserDetailsService userDetailService;
  
  @Override
  protected void configure(HttpSecurity http) throws Exception{
    http.authorizeRequests().antMatchers("/**").authenticated();
    http.formLogin();
    http.logout().logoutRequestMatcher(new AntPathRequestMatcher("/logout")).logoutSuccessUrl("/");
  }
  
//   @Bean
//   public DaoAuthenticationProvider authenticationProvider() {
//       DaoAuthenticationProvider authenticationProvider = new DaoAuthenticationProvider();
//       authenticationProvider.setUserDetailsService(userDetailService);
//       return authenticationProvider;
//   }
}