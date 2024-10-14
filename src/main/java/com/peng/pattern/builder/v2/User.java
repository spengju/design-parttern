package com.peng.pattern.builder.v2;

/**
 * @Author: spengju
 * @Slogan: Day day no bug.
 * @Date: 2024/10/13 17:20
 * @Desc:
 */
public class User {
    private final String username;
    private final String email;
    private final String address;
    private final String code;
    private final String role;


    public User(String username, String email, String address, String code, String role) {
        this.username = username;
        this.email = email;
        this.address = address;
        this.code = code;
        this.role = role;
    }

//    public User() {
//    }

    static class Builder {
        private String username;
        private String email;
        private String address;
        private String code;
        private String role;

        public Builder username(String username) {
            this.username = username;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public Builder code(String code) {
            this.code = code;
            return this;
        }

        public Builder role(String role) {
            this.role = role;
            return this;
        }

        User build() {
            User user = new User(this.username, this.email, this.address, this.code, this.role);
            return user;
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", code='" + code + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
