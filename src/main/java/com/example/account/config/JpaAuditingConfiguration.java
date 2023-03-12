package com.example.account.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@Configuration
@EnableJpaAuditing
//DB에 데이터를 저장하거나 업데이트할 때 , @CreatedDate, @LastModifiedDate 붙은 값들을 자동으로 저장
public class JpaAuditingConfiguration {
    // Spring Application 쓸 때 auto scan 가능
}
