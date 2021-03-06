package org.matrix.spring.aop.operation;

import org.matrix.spring.aop.upgrade.Access;
import org.matrix.spring.aop.upgrade.Hock;
import org.matrix.spring.aop.upgrade.HockParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Hock
public class UserService {

    @Autowired
    AccessHock accessHock;

    @Access
    public void delete(int id) {
        //accessHock.access();
        System.err.println("当前删除用户编号为：" + id);
        System.err.println("删除成功！");
    }

    @Access
    public void add(@HockParam int id) {
        //accessHock.access();
        System.err.println("当前添加用户编号为：" + id);
        System.err.println("添加成功！");
    }

}
