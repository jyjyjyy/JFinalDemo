package cn.pangpython.config;

import com.jfinal.config.Constants;
import com.jfinal.config.Handlers;
import com.jfinal.config.Interceptors;
import com.jfinal.config.JFinalConfig;
import com.jfinal.config.Plugins;
import com.jfinal.config.Routes;
import com.jfinal.core.JFinal;
import com.jfinal.template.Engine;

import cn.pangpython.controller.IndexController;


/**
 * @author pangPython
 *  JFinal 项目配置文件
 */
public class JFConfig extends JFinalConfig {

    @Override
    public void configConstant(Constants me) {
        //开启开发模式
        me.setDevMode(true);
        //这里可以通过配置文件来读取配置参数，更灵活
    }

    @Override
    public void configRoute(Routes me) {
        //这里是根目录Url由IndexController控制器来响应这个请求
        me.add("/abc",IndexController.class);
    }

    @Override
    public void configHandler(Handlers arg0) {
        // 这里可以配置全局处理器 防止直接访问模板文件暴露数据库表和字段      
    }

    @Override
    public void configInterceptor(Interceptors arg0) {
        // 这里可以配置拦截器进项权限管理      
    }

    @Override
    public void configPlugin(Plugins arg0) {
        // 这里可以配置JFinal的各种插件，比如数据库插件等
    }

    //使用JFinal内置的jetty启动项目，直接作为java application运行此文件  http://localhost:8689/cba/abc http://localhost:8080/TestJF/abc/cba
    public static void main(String[] args) {
        JFinal.start("WebContent", 8689, "/cba", 5);
    }

	@Override
	public void configEngine(Engine me) {
		// TODO Auto-generated method stub
		
	}

}