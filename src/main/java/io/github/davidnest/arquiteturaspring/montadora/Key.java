package io.github.davidnest.arquiteturaspring.montadora;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
public class Key {
    private Automaker autoMaker;
    private String type;
}
