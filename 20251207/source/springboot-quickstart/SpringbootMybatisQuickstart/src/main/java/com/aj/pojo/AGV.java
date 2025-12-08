package com.aj.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AGV {
    private Integer id;
    private String eName;
    private String type;
    private Integer navType;

    public AGV(int id, String eName, String type, int navType) {
    }
}
