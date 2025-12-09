package com.aj.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AGV {
    private int id;
    private String eName;
    private String type;
    private int navType;
}
