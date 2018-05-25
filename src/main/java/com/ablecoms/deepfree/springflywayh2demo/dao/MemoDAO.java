package com.ablecoms.deepfree.springflywayh2demo.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ablecoms.deepfree.springflywayh2demo.vo.MemoDT;

@Repository
public class MemoDAO {
	private static final Logger logger = LoggerFactory.getLogger(MemoDAO.class);

	protected String mapperNamespace = this.getClass().getName() + ".";

	@Autowired protected SqlSession sqlSession;

	public List<MemoDT> getList() {
		return sqlSession.selectList(mapperNamespace + "getList");
	}

	public void addMemo(MemoDT dt) {
		logger.info("dt: {}", dt);
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("dt", dt);
		sqlSession.insert(mapperNamespace + "addMemo", param);
	}

}
