package com.greenstitch.greenstitch.Service;

import com.greenstitch.greenstitch.Dto.LoginDto;
import com.greenstitch.greenstitch.model.Users;
import com.greenstitch.greenstitch.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UsersService implements UserDetailsService {

    private UserRepo userRepo;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    public UsersService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    public Users createUser(Users user){
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return this.userRepo.save(user);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return this.userRepo.findByEmail(username).orElseThrow(()-> new UsernameNotFoundException("User Not Found"));
    }
}
