package com.sn.dk.config;

import com.sn.dk.model.Person;
import org.springframework.batch.item.ItemProcessor;

import java.security.SecureRandom;
import java.util.Random;

public class PersonItemProcessor implements ItemProcessor<Person, Person> {

    private static final Random RANDOM = new SecureRandom();
    private static final String ALPHABET = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

    @Override
    public Person process(Person person) throws Exception {
        /*
            Possibilité d'ajouter des traitements sur l'item person avant insertion en base de donnee
            Exemple : generation mot de passe
         */

        person.setPassword(generatePassword(10));

        return person;
    }

    private  String generatePassword(int length) {
        StringBuilder returnValue = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            returnValue.append(ALPHABET.charAt(RANDOM.nextInt(ALPHABET.length())));
        }
        return new String(returnValue);
    }
}