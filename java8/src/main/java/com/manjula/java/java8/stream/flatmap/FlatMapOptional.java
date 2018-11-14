package com.manjula.java.java8.stream.flatmap;

import static java.util.Collections.emptyList;
import static java.util.stream.Collectors.toList;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FlatMapOptional {

    public static void main(String[] args) {
        List<User> list = Arrays.asList(User.newInstance(1, "Manjula", "Jayawardana"),
                User.newInstance(2, "Jon", "Snow"), User.newInstance(3, "Dolores", "Abernathy"));
        Optional<List<User>> optional = Optional.of(list);

        // map
        optional.map(u -> {
            return u.stream().map(user -> {
                String view = user.getId() + " -> " + user.getFullName();
                return UserView.newInstance(view);
            }).collect(toList());
        }).orElse(emptyList()).forEach(System.out::println);

        optional.orElse(emptyList())
                .stream()
                .map(user -> {
                    String view = user.getId() + " -> " + user.getFullName();
                    return UserView.newInstance(view);
                })
                .forEach(System.out::println);
    }

}

/**
<String> Stream<String> flatMap(Function<String[], Stream<String>> mapper)

<String> Stream<String> flatMap(Function<List<String>, Stream<String>> mapper)

<String> Stream<String> flatMap(Function<Set<String>, Stream<String>> mapper)

<String> Stream<String> flatMap(Function<Map<Integer, String>, Stream<String>> mapper)

<List<User>> Optional<List<User>> Optional.flatMap(Function<List<User>, Optional<List<User>>> mapper)
*/

