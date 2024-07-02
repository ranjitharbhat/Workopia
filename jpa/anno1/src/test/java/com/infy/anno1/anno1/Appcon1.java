package com.infy.anno1.anno1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Appcon1 {
@Bean
public SmsService smsser()
{
	return new SmsService();
}
@Bean
public EmailService emser()
{
	return new EmailService();
}
@Bean
public CommuService com()
{
	return new CommuService();
}
}
