package models;

import com.activeandroid.annotation.Table;
import com.activeandroid.annotation.Column;

/**
 * Created by Ariel on 10/27/15.
 */
@Table(name = "Users", id = "_id")
public class User extends Model {

    @Column(name = "Name")
    private String mName;

    public User() {
        super();
    }

    public User(String name) {
        super();
        mName = name;
    }

    public String getName() {
        return mName;
    }
}