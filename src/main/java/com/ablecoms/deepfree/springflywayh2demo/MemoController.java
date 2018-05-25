package com.ablecoms.deepfree.springflywayh2demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ablecoms.deepfree.springflywayh2demo.dao.MemoDAO;
import com.ablecoms.deepfree.springflywayh2demo.vo.MemoDT;

@RestController
@RequestMapping("/memo")
public class MemoController {

	@Autowired MemoDAO dao;

	@GetMapping("/")
	public List<MemoDT> getList() {
		return dao.getList();
	}

	@PostMapping("/")
	public MemoDT addMemo(@RequestBody MemoDT dt) {
		//{"memo": "메모1", "creator": "민병돈"}
		dao.addMemo(dt);
		return dt;
	}

}
