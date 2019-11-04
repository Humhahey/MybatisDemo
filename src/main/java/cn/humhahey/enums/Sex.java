package cn.humhahey.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@AllArgsConstructor
public enum Sex {
    MALE(1, "男"), FEMALE(0, "女");
    @Setter
    private int id;
    @Setter
    private String name;

    public static Sex getSex(String s) {
        if (s.equals(FEMALE.name)) {
            return FEMALE;
        }
        return MALE;
    }

}
