package com.springMvc.myBatis.controller;

import com.springMvc.myBatis.PoVo.Json;
import com.springMvc.myBatis.PoVo.JsonResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.alibaba.fastjson.JSON;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
@Controller
@RequestMapping("/calculate")
public class ComputerController {

    @RequestMapping("/jisuan")
    public String HE(){
        return "hello";
    }


    @RequestMapping("/su")
    public void hello(@RequestParam(value = "money") String money,
                      @RequestParam(value = "moshi") String moshi,
                      HttpServletResponse response) {
        try {

            response.setContentType("application/json;charset=UTF-8");
            response.setHeader("Pragma", "No-cache");
            response.setHeader("Cache-Control", "no-cache");
//        response.setHeader("Cache-Control", "no-cache,no-store,must-revalidate,max-age=-1");
            response.setDateHeader("Expires", 0);   //设置为不缓冲
            PrintWriter out = response.getWriter();
            JsonResult jsonResult=new JsonResult();
            try {
                if(Integer.parseInt(moshi)==1){
                    jsonResult=dianqi(money);
                }else if(Integer.parseInt(moshi)==2){
                    jsonResult=chuFang(money);
                }else if(Integer.parseInt(moshi)==3){
                    jsonResult=jiaJu(money);
                }
            }catch (Exception e){
                jsonResult.setSuccess(false);
            }
            String jsonStr = JSON.toJSONString(jsonResult);
            out.write(jsonStr);
            out.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public JsonResult dianqi(String money){
        BigDecimal moneys =new BigDecimal(money);
        JsonResult jsonResult=new JsonResult();
        List<Json> jsonList=new ArrayList<Json>();
        BigDecimal dMoneys;
        for (int i=1;i<6;i++){
            if(i==1){
               dMoneys=moneys.multiply(new BigDecimal("0.525")).setScale(0,BigDecimal.ROUND_HALF_UP);

            }else if(i==2){
                dMoneys=moneys.multiply(new BigDecimal("0.43")).setScale(0,BigDecimal.ROUND_HALF_UP);

            }else if(i==3){
                dMoneys=moneys.multiply(new BigDecimal("0.335")).setScale(0,BigDecimal.ROUND_HALF_UP);

            }else if(i==4){
               dMoneys=moneys.multiply(new BigDecimal("0.24")).setScale(0,BigDecimal.ROUND_HALF_UP);

            }else{
                dMoneys=moneys.multiply(new BigDecimal("0.145")).setScale(0,BigDecimal.ROUND_HALF_UP);
            }
            BigDecimal sMoneys=dMoneys.multiply(new BigDecimal("0.35")).setScale(0,BigDecimal.ROUND_HALF_UP);
            BigDecimal dkMoneys=dMoneys.multiply(new BigDecimal("0.65")).setScale(0,BigDecimal.ROUND_HALF_UP);
            BigDecimal xMoneys=dkMoneys.multiply(new BigDecimal("0.4")).setScale(0,BigDecimal.ROUND_HALF_UP);
            Json json=new Json(dMoneys.toString(),sMoneys.toString(),dkMoneys.toString(),xMoneys.toString());
            jsonList.add(json);
        }
        jsonResult.setSuccess(true);
        jsonResult.setData(jsonList);
        return jsonResult;
    }

    public JsonResult bingXiang(String money){
        BigDecimal moneys =new BigDecimal(money);
        JsonResult jsonResult=new JsonResult();
        List<Json> jsonList=new ArrayList<Json>();
        for (int i=0;i<7;i++){
            if(i==1){
                BigDecimal dMoneys=moneys.multiply(new BigDecimal("0.685")).setScale(2,BigDecimal.ROUND_HALF_DOWN);
                BigDecimal sMoneys=dMoneys.multiply(new BigDecimal("0.3")).setScale(2,BigDecimal.ROUND_HALF_DOWN);
                BigDecimal dkMoneys=dMoneys.multiply(new BigDecimal("0.7")).setScale(2,BigDecimal.ROUND_HALF_DOWN);
                BigDecimal xMoneys=dkMoneys.multiply(new BigDecimal("0.4")).setScale(2,BigDecimal.ROUND_HALF_DOWN);
                Json json=new Json(dMoneys.toString(),sMoneys.toString(),dkMoneys.toString(),xMoneys.toString());
                jsonList.add(json);
            }else if(i==2){
                BigDecimal dMoneys=moneys.multiply(new BigDecimal("0.64")).setScale(2,BigDecimal.ROUND_HALF_DOWN);
                BigDecimal sMoneys=dMoneys.multiply(new BigDecimal("0.3")).setScale(2,BigDecimal.ROUND_HALF_DOWN);
                BigDecimal dkMoneys=dMoneys.multiply(new BigDecimal("0.7")).setScale(2,BigDecimal.ROUND_HALF_DOWN);
                BigDecimal xMoneys=dkMoneys.multiply(new BigDecimal("0.4")).setScale(2,BigDecimal.ROUND_HALF_DOWN);
                Json json=new Json(dMoneys.toString(),sMoneys.toString(),dkMoneys.toString(),xMoneys.toString());
                jsonList.add(json);
            }else if(i==3){
                BigDecimal dMoneys=moneys.multiply(new BigDecimal("0.595")).setScale(2,BigDecimal.ROUND_HALF_DOWN);
                BigDecimal sMoneys=dMoneys.multiply(new BigDecimal("0.3")).setScale(2,BigDecimal.ROUND_HALF_DOWN);
                BigDecimal dkMoneys=dMoneys.multiply(new BigDecimal("0.7")).setScale(2,BigDecimal.ROUND_HALF_DOWN);
                BigDecimal xMoneys=dkMoneys.multiply(new BigDecimal("0.4")).setScale(2,BigDecimal.ROUND_HALF_DOWN);
                Json json=new Json(dMoneys.toString(),sMoneys.toString(),dkMoneys.toString(),xMoneys.toString());
                jsonList.add(json);
            }else if(i==4){
                BigDecimal dMoneys=moneys.multiply(new BigDecimal("0.55")).setScale(2,BigDecimal.ROUND_HALF_DOWN);
                BigDecimal sMoneys=dMoneys.multiply(new BigDecimal("0.3")).setScale(2,BigDecimal.ROUND_HALF_DOWN);
                BigDecimal dkMoneys=dMoneys.multiply(new BigDecimal("0.7")).setScale(2,BigDecimal.ROUND_HALF_DOWN);
                BigDecimal xMoneys=dkMoneys.multiply(new BigDecimal("0.4")).setScale(2,BigDecimal.ROUND_HALF_DOWN);
                Json json=new Json(dMoneys.toString(),sMoneys.toString(),dkMoneys.toString(),xMoneys.toString());
                jsonList.add(json);
            }else if(i==5){
                BigDecimal dMoneys=moneys.multiply(new BigDecimal("0.46")).setScale(2,BigDecimal.ROUND_HALF_DOWN);
                BigDecimal sMoneys=dMoneys.multiply(new BigDecimal("0.3")).setScale(2,BigDecimal.ROUND_HALF_DOWN);
                BigDecimal dkMoneys=dMoneys.multiply(new BigDecimal("0.7")).setScale(2,BigDecimal.ROUND_HALF_DOWN);
                BigDecimal xMoneys=dkMoneys.multiply(new BigDecimal("0.4")).setScale(2,BigDecimal.ROUND_HALF_DOWN);
                Json json=new Json(dMoneys.toString(),sMoneys.toString(),dkMoneys.toString(),xMoneys.toString());
                jsonList.add(json);
            }else if(i==6) {
                BigDecimal dMoneys=moneys.multiply(new BigDecimal("0.37")).setScale(2,BigDecimal.ROUND_HALF_DOWN);
                BigDecimal sMoneys=dMoneys.multiply(new BigDecimal("0.3")).setScale(2,BigDecimal.ROUND_HALF_DOWN);
                BigDecimal dkMoneys=dMoneys.multiply(new BigDecimal("0.7")).setScale(2,BigDecimal.ROUND_HALF_DOWN);
                BigDecimal xMoneys=dkMoneys.multiply(new BigDecimal("0.4")).setScale(2,BigDecimal.ROUND_HALF_DOWN);
                Json json=new Json(dMoneys.toString(),sMoneys.toString(),dkMoneys.toString(),xMoneys.toString());
                jsonList.add(json);
            }
        }
        jsonResult.setSuccess(true);
        jsonResult.setData(jsonList);
        return jsonResult;
    }
    public JsonResult qiTa(String money){
        BigDecimal moneys =new BigDecimal(money);
        JsonResult jsonResult=new JsonResult();
        List<Json> jsonList=new ArrayList<Json>();
        for (int i=0;i<7;i++){
            if(i==1){
                BigDecimal dMoneys=moneys.multiply(new BigDecimal("0.64")).setScale(2,BigDecimal.ROUND_HALF_DOWN);
                BigDecimal sMoneys=dMoneys.multiply(new BigDecimal("0.3")).setScale(2,BigDecimal.ROUND_HALF_DOWN);
                BigDecimal dkMoneys=dMoneys.multiply(new BigDecimal("0.7")).setScale(2,BigDecimal.ROUND_HALF_DOWN);
                BigDecimal xMoneys=dkMoneys.multiply(new BigDecimal("0.4")).setScale(2,BigDecimal.ROUND_HALF_DOWN);
                Json json=new Json(dMoneys.toString(),sMoneys.toString(),dkMoneys.toString(),xMoneys.toString());
                jsonList.add(json);
            }else if(i==2){
                BigDecimal dMoneys=moneys.multiply(new BigDecimal("0.595")).setScale(2,BigDecimal.ROUND_HALF_DOWN);
                BigDecimal sMoneys=dMoneys.multiply(new BigDecimal("0.3")).setScale(2,BigDecimal.ROUND_HALF_DOWN);
                BigDecimal dkMoneys=dMoneys.multiply(new BigDecimal("0.7")).setScale(2,BigDecimal.ROUND_HALF_DOWN);
                BigDecimal xMoneys=dkMoneys.multiply(new BigDecimal("0.4")).setScale(2,BigDecimal.ROUND_HALF_DOWN);
                Json json=new Json(dMoneys.toString(),sMoneys.toString(),dkMoneys.toString(),xMoneys.toString());
                jsonList.add(json);
            }else if(i==3){
                BigDecimal dMoneys=moneys.multiply(new BigDecimal("0.55")).setScale(2,BigDecimal.ROUND_HALF_DOWN);
                BigDecimal sMoneys=dMoneys.multiply(new BigDecimal("0.3")).setScale(2,BigDecimal.ROUND_HALF_DOWN);
                BigDecimal dkMoneys=dMoneys.multiply(new BigDecimal("0.7")).setScale(2,BigDecimal.ROUND_HALF_DOWN);
                BigDecimal xMoneys=dkMoneys.multiply(new BigDecimal("0.4")).setScale(2,BigDecimal.ROUND_HALF_DOWN);
                Json json=new Json(dMoneys.toString(),sMoneys.toString(),dkMoneys.toString(),xMoneys.toString());
                jsonList.add(json);
            }else if(i==4){
                BigDecimal dMoneys=moneys.multiply(new BigDecimal("0.46")).setScale(2,BigDecimal.ROUND_HALF_DOWN);
                BigDecimal sMoneys=dMoneys.multiply(new BigDecimal("0.3")).setScale(2,BigDecimal.ROUND_HALF_DOWN);
                BigDecimal dkMoneys=dMoneys.multiply(new BigDecimal("0.7")).setScale(2,BigDecimal.ROUND_HALF_DOWN);
                BigDecimal xMoneys=dkMoneys.multiply(new BigDecimal("0.4")).setScale(2,BigDecimal.ROUND_HALF_DOWN);
                Json json=new Json(dMoneys.toString(),sMoneys.toString(),dkMoneys.toString(),xMoneys.toString());
                jsonList.add(json);
            }
        }
        jsonResult.setSuccess(true);
        jsonResult.setData(jsonList);
        return jsonResult;
    }

    public JsonResult jiaJu(String money){
        BigDecimal moneys =new BigDecimal(money);
        JsonResult jsonResult=new JsonResult();
        List<Json> jsonList=new ArrayList<Json>();
        BigDecimal dMoneys;
        for (int i=1;i<4;i++){
            if(i==1){
                dMoneys=moneys.multiply(new BigDecimal("0.335")).setScale(0,BigDecimal.ROUND_HALF_UP);
            }else if(i==2){
                dMoneys=moneys.multiply(new BigDecimal("0.24")).setScale(0,BigDecimal.ROUND_HALF_UP);
            }else{
                dMoneys=moneys.multiply(new BigDecimal("0.145")).setScale(0,BigDecimal.ROUND_HALF_UP);
            }
            BigDecimal sMoneys=dMoneys.multiply(new BigDecimal("0.4")).setScale(0,BigDecimal.ROUND_HALF_UP);
            BigDecimal dkMoneys=dMoneys.multiply(new BigDecimal("0.6")).setScale(0,BigDecimal.ROUND_HALF_UP);
            BigDecimal xMoneys=dkMoneys.multiply(new BigDecimal("0.35")).setScale(0,BigDecimal.ROUND_HALF_UP);
            Json json=new Json(dMoneys.toString(),sMoneys.toString(),dkMoneys.toString(),xMoneys.toString());
            jsonList.add(json);
        }
        jsonResult.setSuccess(true);
        jsonResult.setData(jsonList);
        return jsonResult;

    }


    public JsonResult chuFang(String money){
        BigDecimal moneys =new BigDecimal(money);
        JsonResult jsonResult=new JsonResult();
        List<Json> jsonList=new ArrayList<Json>();
        BigDecimal dMoneys;
        for (int i=1;i<5;i++){
            if(i==1){
                dMoneys=moneys.multiply(new BigDecimal("0.43")).setScale(0,BigDecimal.ROUND_HALF_UP);
            }else if(i==2){
                dMoneys=moneys.multiply(new BigDecimal("0.335")).setScale(0,BigDecimal.ROUND_HALF_UP);

            }else if(i==3){
                dMoneys=moneys.multiply(new BigDecimal("0.24")).setScale(0,BigDecimal.ROUND_HALF_UP);

            }else{
                dMoneys=moneys.multiply(new BigDecimal("0.145")).setScale(0,BigDecimal.ROUND_HALF_UP);

            }
            BigDecimal sMoneys=dMoneys.multiply(new BigDecimal("0.4")).setScale(0,BigDecimal.ROUND_HALF_UP);
            BigDecimal dkMoneys=dMoneys.multiply(new BigDecimal("0.6")).setScale(0,BigDecimal.ROUND_HALF_UP);
            BigDecimal xMoneys=dkMoneys.multiply(new BigDecimal("0.4")).setScale(0,BigDecimal.ROUND_HALF_UP);
            Json json=new Json(dMoneys.toString(),sMoneys.toString(),dkMoneys.toString(),xMoneys.toString());
            jsonList.add(json);
        }
        jsonResult.setSuccess(true);
        jsonResult.setData(jsonList);
        return jsonResult;
    }

}
