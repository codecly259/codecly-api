package top.codecly.api.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName UserEntity
 * @Description TODO
 * @Author maxinchun
 * @Date 2018/8/19 21:10
 */
@Data
public class UserEntity implements Serializable{

    private long userId;

    private int age;

    private String name;

    private String address;
}
