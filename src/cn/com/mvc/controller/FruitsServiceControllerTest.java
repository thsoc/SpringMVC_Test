package cn.com.mvc.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import cn.com.mvc.model.Fruits;

/**
 * 1
 * @author mzg
 *
 */
public class FruitsServiceControllerTest implements Controller{
	private FruitsService fruitsService = new FruitsService();

	@Override
	public ModelAndView handleRequest(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {
		List<Fruits> fruitsList = fruitsService.queryFruitsList();
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("fruitsList", fruitsList);
		modelAndView.setViewName("/WEB-INF/jsp/fruits/fruitsList.jsp");
		return modelAndView;
	}
}

class FruitsService{
	public List<Fruits> queryFruitsList(){
		List<Fruits> fruitsList = new ArrayList<Fruits>();
		Fruits apple = new Fruits();
		apple.setName("�츻ʿƻ��");
		apple.setPrice(2.3);
		apple.setProducting_area("ɽ��");
		
		Fruits banana = new Fruits();
		banana.setName("�㽶");
		banana.setPrice(1.5);
		banana.setProducting_area("�Ϻ�");
		
		fruitsList.add(apple);
		fruitsList.add(banana);
		return fruitsList;
		
	}
	
}