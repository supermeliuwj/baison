package priv.lwj.thinker.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import priv.lwj.thinker.test.pojo.User;
import priv.lwj.thinker.test.service.UserService;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/test")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/test")
    public Map<String, Object> test(){
        Map<String, Object> map = new HashMap<>();
        map.put("test", "test");
        return map;
    }
    @RequestMapping("/insert")
    int insert(@RequestBody User user) { return userService.insert(user);};
    @RequestMapping("/update")
    int update(@RequestBody User user) {return userService.update(user);};
    @RequestMapping("/delete")
    int delete(Integer id){return userService.delete(id);};
    @RequestMapping("/getById")
    public User getById(Integer userId){
        return userService.getById(userId);
    }
}
