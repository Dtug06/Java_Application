package org.example;

import org.example.config.AppConfig;
import org.example.model.SystemConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        // Khởi tạo Spring Container
        ApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        // Lấy Bean
        SystemConfig config = context.getBean(SystemConfig.class);

        // In kết quả
        System.out.println("Chi nhánh: " + config.getBranchName());
        System.out.println("Giờ mở cửa: " + config.getOpeningHour());
    }
}