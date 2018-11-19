package com.indieLance.indieLanceServerSide.graphQLQueries.inputs;

import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserInput {
    private String name;
    private String lastName;
    private String email;

    //TODO normalizuoti
    private String phone;
    private String region;
}
