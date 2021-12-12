//package com.example.webnetflix.config;
//import com.example.webnetflix.service.CustomerUserDetailService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.builders.WebSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//
//@Configuration
//@EnableWebSecurity
//public class SecurityConfig extends WebSecurityConfigurerAdapter {
//    @Autowired
//    private CustomerUserDetailService customerUserDetailService;
//    @Bean
//    public PasswordEncoder passwordEncoder(){
//        return new BCryptPasswordEncoder();
//    }
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.authorizeRequests()
//                .antMatchers("/","/vendor/**","/js/**","/images/**","/fonts/**","/css/**").permitAll()
//                .anyRequest().authenticated().and()
//                .formLogin().loginPage("/login").permitAll()
//                .defaultSuccessUrl("/login?success=true")
//                .failureUrl("/login?success=false")
//                .loginProcessingUrl("/j_spring_security_check");
//    }
//
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.userDetailsService(customerUserDetailService).passwordEncoder(passwordEncoder());
////        auth.inMemoryAuthentication()
////                .withUser("user").password(passwordEncoder().encode("12345"))
////                .authorities("ROLE_USER");
//    }
//}
