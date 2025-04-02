package util.person.generator;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PersonGenerator {

    private static final String[] NAMES = {
        "John", "Jane", "Alice", "Bob", "Charlie", "David", "Emma", "Frank", 
        "Grace", "Hank", "Ivy", "Jack", "Karen", "Leo", "Mia", "Nathan", "Olivia", 
        "Paul", "Quinn", "Rachel", "Steve", "Tina", "Ursula", "Victor", "Wendy"
    };

    private static final String[] HOBBIES = {
        "Reading", "Swimming", "Cycling", "Hiking", "Gaming", "Cooking", 
        "Dancing", "Singing", "Drawing", "Writing"
    };

    private static final String[] SOCIAL_NETWORKS = {
        "Instagram", "Twitter", "Facebook", "LinkedIn"
    };

    public static List<Person> generateRandomPersons() {
        Random random = new Random();
        List<Person> persons = new ArrayList<>();

        for (int i = 0; i < 25; i++) {
            Person person = new Person();
            person.setName(NAMES[random.nextInt(NAMES.length)]);
            person.setAge(random.nextInt(80) + 18); // Age between 18 and 97
            person.setWeight(Math.round((50 + (100 - 50) * random.nextDouble()) * 100.0) / 100.0); // Weight between 50 and 100 kg
            person.setGender(random.nextBoolean() ? 'M' : 'F');
            person.setMarried(random.nextBoolean());
            int randomDay = random.nextInt(365); // Random day in the year
            //person.setBirthDate(LocalDate.now().minusYears(person.getAge()));
            person.setBirthDate(LocalDate.now().minusYears(person.getAge()).minusDays(randomDay));
            person.setHobbies(generateRandomHobbies(random));
            person.setSocialNetworks(generateRandomSocialNetworks(person.getName(), random));

            persons.add(person);
        }
        return persons;
    }

    private static List<String> generateRandomHobbies(Random random) {
        List<String> hobbyList = new ArrayList<>();
        while (hobbyList.size() < 2) {
            String hobby = HOBBIES[random.nextInt(HOBBIES.length)];
            if (!hobbyList.contains(hobby)) {
                hobbyList.add(hobby);
            }
        }
        return hobbyList;
    }

    private static List<SocialNetwork> generateRandomSocialNetworks(String personName, Random random) {
        List<SocialNetwork> socialNetworkList = new ArrayList<>();
        while (socialNetworkList.size() < 2) {
            String network = SOCIAL_NETWORKS[random.nextInt(SOCIAL_NETWORKS.length)];
            if (socialNetworkList.stream().noneMatch(sn -> sn.getName().equals(network))) {
                SocialNetwork sn = new SocialNetwork();
                sn.setName(network);
                sn.setUsername(personName.toLowerCase() + random.nextInt(100)); // Unique username
                sn.setFollowers(random.nextInt(100_000));
                sn.setActive(random.nextBoolean());

                // Generate a random date (1-10 years ago, random month and day)
                int yearsAgo = random.nextInt(10) + 1; // 1-10 years ago
                int randomMonth = random.nextInt(12) + 1; // 1-12
                int randomDay = random.nextInt(28) + 1; // Ensures valid day for all months
                sn.setCreatedAt(LocalDate.of(LocalDate.now().getYear() - yearsAgo, randomMonth, randomDay));

                socialNetworkList.add(sn);
            }
        }
        return socialNetworkList;
    }
}
