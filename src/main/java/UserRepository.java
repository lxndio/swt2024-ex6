public interface UserRepository {
    User findById(String id);
    User findByName(String name);
}
