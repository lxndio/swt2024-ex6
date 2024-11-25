public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public String getUserName(String userId) {
        User user = userRepository.findById(userId);

        if (user != null) {
            return user.getName();
        } else {
            return null;
        }
    }
}
