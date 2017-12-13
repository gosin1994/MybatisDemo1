package cn.itcast.mybatis.dao.impl;

/**
 * @Author: Gosin
 * @Date: 2017/12/13 17:43
 */
public class UserDaoImpl {
/*
    @Override
    public void addUser(User user) {
        SqlSession session = MyBatisUtil.getSession();

        //获取当前调用的接口的全限定名
        Class interfaces = (this.getClass().getInterfaces())[0];
        String interfacesName = interfaces.getName();
        System.out.println("interfacesName--》"+interfacesName);

        //获取当前线程调用的方法名字
        String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
        System.out.println("methodMethod--》" + methodName);

        *//*session.insert("cn.itcast.mybatis.model.User.addUser",user);*//*
        session.insert(interfacesName+"."+methodName,user);
        session.commit();
        session.close();
    }*/
}
