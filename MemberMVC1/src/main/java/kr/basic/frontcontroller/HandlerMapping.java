package kr.basic.frontcontroller;



import java.util.HashMap;

import kr.basic.controller.MainController;




public class HandlerMapping {
  private HashMap<String, Controller> mappings;
  public HandlerMapping() { 
	  mappings=new HashMap<String, Controller>();
	  mappings.put("/main.do", new MainController());
//	  mappings.put("/join.do", new JoinUserController());	
//	  mappings.put("/loginCheck.do", new LoginCheckController());	
//	  mappings.put("/loginOut.do", new LoginOutController());	
//	  mappings.put("/validateId.do", new ValidateIdController());
//	  mappings.put("/userInfo.do", new UserInfoController());
//	  mappings.put("/updateUser.do", new UpdateUserController()); 
//	  mappings.put("/deleteUser.do", new DeleteUserController());
//	  
//	  mappings.put("/carList.do", new CarListController());
//	  mappings.put("/selectCarOption.do", new SelectCarOptionController());
//	  mappings.put("/reservateCar.do", new ReservateCarController());
//	  mappings.put("/userReserveList.do", new UserReserveListController());
//	  mappings.put("/deleteRes.do", new DeleteResController());
//	  
//	  mappings.put("/uploadCarImg.do", new UploadCarImgController());
//	  mappings.put("/insertCar.do", new InsertCarController());
//	  mappings.put("/rentcarInfo.do", new CarInfoController());
//	  mappings.put("/admininfo.do", new AdminInfoController());
	  
	 
	  

  }
  public Controller getController(String key) { 
	  return mappings.get(key);
  }
}
