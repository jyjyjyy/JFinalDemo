package cn.pangpython.controller;

import com.jfinal.core.Controller;


/**
 * @author vampire
 *
 */
public class IndexController extends Controller {
    public void index(){
        renderText("index");
    }
}