package br.com.hemar.encryptproperties;

import com.ulisesbocchio.jasyptspringboot.encryptor.DefaultLazyEncryptor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAutoConfiguration
@SpringBootApplication
public class EncryptPropertiesApplication {

	public static void main(String[] args) {
		SpringApplication.run(EncryptPropertiesApplication.class, args);
	}

}
