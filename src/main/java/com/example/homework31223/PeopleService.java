package com.example.homework31223;

import lombok.Data;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
@Data
@Service
@SpringBootApplication
public class PeopleService {

        private List<People> people = Arrays.asList(
                new People("John", 1),
                new People("Alice", 2),
                new People("Bob", 3)
        );
        private int serviceRunCount = 0;
        private List<People> allPeople;

        public RecommendationDto getRecommendationAndAllPeople() {
            incrementServiceRunCount();

            String shortestName = people.stream()
                    .min((p1, p2) -> Integer.compare(p1.getName().length(), p2.getName().length()))
                    .map(People::getName)
                    .orElse(null);

            return new RecommendationDto(people, shortestName);
        }

        public String getShortestNameRecommendation() {
            incrementServiceRunCount();

            return people.stream()
                    .min((p1, p2) -> Integer.compare(p1.getName().length(), p2.getName().length()))
                    .map(People::getName)
                    .orElse(null);
        }

        public int getServiceRunCount() {
            return serviceRunCount;
        }

        private void incrementServiceRunCount() {
            serviceRunCount++;
        }

        public List<People> getAllPeople() {
            return people;
        }

        public void setAllPeople(List<People> allPeople) {
            this.allPeople = allPeople;
        }

        public static class RecommendationDto {
            private List<People> people;
            private String shortestName;

            public RecommendationDto(List<People> people, String shortestName) {
                this.people = people;
                this.shortestName = shortestName;
            }

            public List<People> getPeople() {
                return people;
            }

            public String getShortestName() {
                return shortestName;
            }
        }
    }