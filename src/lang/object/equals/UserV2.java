package lang.object.equals;

public class UserV2 {

    private String id;

    public UserV2(final String id) {
        this.id = id;
    }

    @Override
    public boolean equals(final Object obj) {
        UserV2 user = (UserV2) obj;
        return id.equals(user.id);
    }
}
