FROM java:8
VOLUME /tmp
EXPOSE 8080
ADD ./out/artifacts/spring_boot_ecommerce_jar/spring-boot-ecommerce.jar .
ENTRYPOINT ["java","-jar","spring-boot-ecommerce.jar"]