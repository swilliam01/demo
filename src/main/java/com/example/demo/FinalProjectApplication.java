package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class FinalProjectApplication {
    private static final Logger log = LoggerFactory.getLogger(FinalProjectApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(FinalProjectApplication.class, args);
    }
    @Autowired
    UserRepository userRepository;

    @Autowired
    ReposRepository reposRepository;
    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

    @Bean
    public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
        return args -> {


           // User user1 = restTemplate.getForObject("https://api.github.com/users/AbezerZergaw", User.class);
            // log.info(user.toString());
          //  userRepository.save(user1);
//            User user2 = restTemplate.getForObject("https://api.github.com/users/bilu-Blen", User.class);
////        log.info(user.toString());
//            userRepository.save(user2);
//
//            User user3 = restTemplate.getForObject("https://api.github.com/users/Ermiji", User.class);
////        log.info(user.toString());
//            userRepository.save(user3);
//            User user4 = restTemplate.getForObject("https://api.github.com/users/GenzebNge", User.class);
////        log.info(user.toString());
//            userRepository.save(user4);
//            User user5 = restTemplate.getForObject("https://api.github.com/users/hagaw", User.class);
////        log.info(user.toString());
//            userRepository.save(user5);
//            User user6 = restTemplate.getForObject("https://api.github.com/users/hoysum", User.class);
////        log.info(user.toString());
//            userRepository.save(user6);
//            User user7 = restTemplate.getForObject("https://api.github.com/users/Irinamiranda", User.class);
////        log.info(user.toString());
//            userRepository.save(user7);
//            User user8 = restTemplate.getForObject("https://api.github.com/users/jhlahey2", User.class);
////        log.info(user.toString());
//            userRepository.save(user8);
//            User user9 = restTemplate.getForObject("https://api.github.com/users/martyheyn", User.class);
////        log.info(user.toString());
//            userRepository.save(user9);
//            User user10 = restTemplate.getForObject("https://api.github.com/users/MelakMinlargilih", User.class);
////        log.info(user.toString());
//            userRepository.save(user10);
//            User user11 = restTemplate.getForObject("https://api.github.com/users/navjotkaur4", User.class);
////        log.info(user.toString());
//            userRepository.save(user11);
//            User user12 = restTemplate.getForObject("https://api.github.com/users/seblechernet", User.class);
////        log.info(user.toString());
//            userRepository.save(user12);
//            User user13 = restTemplate.getForObject("https://api.github.com/users/ShristiA", User.class);
////        log.info(user.toString());
//            userRepository.save(user13);
//            User user14 = restTemplate.getForObject("https://api.github.com/users/smewled2012", User.class);
////        log.info(user.toString());
//            userRepository.save(user14);
//            User user15 = restTemplate.getForObject("https://api.github.com/users/swilliam01", User.class);
////        log.info(user.toString());
//            userRepository.save(user15);
//            User user16 = restTemplate.getForObject("https://api.github.com/users/swimmerlap", User.class);
////        log.info(user.toString());
//            userRepository.save(user16);
//            User user17 = restTemplate.getForObject("https://api.github.com/users/zemenuyar", User.class);
////        log.info(user.toString());
//            userRepository.save(user17);
        };

////            ResponseEntity<List<User>> memberResponse =
////                    restTemplate.exchange("https://api.github.com/orgs/github/members",
////                            HttpMethod.GET, null, new ParameterizedTypeReference<List<User>>() {
////                            });
////            List<User> users = memberResponse.getBody();
////            log.info(users.toString());
//
//            ResponseEntity<List<Repos>> memberResponse =
//                    restTemplate.exchange("https://api.github.com/users/MelakMinlargilih/repos",
//                            HttpMethod.GET, null, new ParameterizedTypeReference<List<Repos>>() {
//                            });
//            List<Repos> repos = memberResponse.getBody();
//            log.info(repos.toString());
//            log.info("----------------------------------------------------");
////            Repos repos = restTemplate.getForObject("https://api.github.com/users/MelakMinlargilih/repos", Repos.class);
////            log.info(repos.toString());
//
//
////            ResponseEntity<List<User>> memberResponse1 =
////                    restTemplate.exchange("https://api.github.com/orgs/JBCSep2018",
////                            HttpMethod.GET, null, new ParameterizedTypeReference<List<User>>() {
////                            });
////            List<User> users = memberResponse1.getBody();
////            log.info(users.toString());
////            log.info("----------------------------------------------------");
//        };
//            // MelakMinlargilih
////            Object[] MelakArray = Arrays.stream(users).filter(x -> x.getLogin().equalsIgnoreCase("Melak")).toArray();
////            log.info("Name :" + ((User) MelakArray[0]).getLogin());
////
////            log.info(" repositories :" + .valueOf(((Coin) vergeArray[0]).getPrice_usd()));
////
////            log.info("-------------------------------------------------");
//
//        //list of contributors
//        //GET /repos/:owner/:repo/contributors
//        //list of languages
//        //GET /repos/:owner/:repo/languages
//
//        //pulls
//        //GET /repos/:owner/:repo/pulls
//
  }
}