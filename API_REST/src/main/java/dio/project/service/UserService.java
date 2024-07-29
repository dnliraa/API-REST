package dio.project.service;

import dio.project.domain.model.User;

public interface UserService {
	
	User findById(Long id);

    User create(User userToCreate);

}
