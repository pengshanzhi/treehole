package com.psz.treehole.Controller;

import java.util.Iterator;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.psz.mapper.ReplyDAO;
import com.psz.mapper.TzDAO;
import com.psz.treehole.Reply;
import com.psz.treehole.Tz;
import com.psz.treehole.TzKey;

@Controller
public class treeholeController {
	
	@ResponseBody
	@RequestMapping("helloWorld")
	public String helloWorld() {
		return "helloWorld";
	}
	
	@Autowired
    private TzDAO TzDAO;
	@Autowired
	private ReplyDAO ReplyDAO;
	private TzKey tzKey;
	private Reply reply;
	
	//请求一个帖子
	@ResponseBody
    @RequestMapping("getOneTz/{Page}&{no}")
    public Tz hello(@PathVariable Integer Page,@PathVariable Integer no){
		tzKey=new TzKey();
    	tzKey.setTpage(Page);
    	tzKey.setTno(no);
    	Tz tz = TzDAO.selectByPrimaryKey(tzKey);
        System.out.println(tz);
        return tz;
    }
	
	//请求对应页数的帖子



	@ResponseBody
	@RequestMapping("/getTz/{Page}")
    public List<Tz> getTz(@PathVariable Integer Page){
 
    	List<Tz> tz = TzDAO.selectByPage(Page);
        System.out.println(tz);
        return tz;
    }
	
	
	//请求对应帖子的回复

	@ResponseBody
	@RequestMapping(path="/getReply/{Page}&{no}",method = RequestMethod.POST)
    public List<Reply> getReply(@PathVariable Integer Page,@PathVariable Integer no){
		tzKey=new TzKey();
    	tzKey.setTpage(Page);
    	tzKey.setTno(no);
    	List<Reply> reply = ReplyDAO.selectByPageNo(tzKey);
        System.out.println(reply);
        return reply;
    }
	
	
	//回复对应帖子
	@ResponseBody
	@RequestMapping(path="/ReplyTz",method = RequestMethod.POST)
    public int ReplyTz( HttpServletRequest request ){
		Integer tno = Integer.parseInt(request.getParameter("tno"));
		Integer tPage = Integer.parseInt(request.getParameter("tPage"));
		String username = request.getParameter("username");
		String content = request.getParameter("content");
		reply=new Reply();
		reply.setTno(tno);
		reply.setTpage(tPage);
		reply.setRusername(username);
		reply.setRcontent(content);
    	int replyTz = ReplyDAO.insertSelective(reply);
        System.out.println(reply);
        return replyTz;
    }

	private Integer Integer(String parameter) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
