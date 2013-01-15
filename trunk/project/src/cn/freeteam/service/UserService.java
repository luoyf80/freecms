package cn.freeteam.service;

import java.util.List;


import cn.freeteam.base.BaseService;
import cn.freeteam.dao.UsersMapper;
import cn.freeteam.model.Users;
import cn.freeteam.model.UsersExample;
import cn.freeteam.model.UsersExample.Criteria;


/**
 * 
 * <p>Title: UserService.java</p>
 * 
 * <p>Description: 用户服务</p>
 * 
 * <p>Date: Dec 16, 2011</p>
 * 
 * <p>Time: 4:49:39 PM</p>
 * 
 * <p>Copyright: 2011</p>
 * 
 * <p>Company: freeteam</p>
 * 
 * @author freeteam
 * @version 1.0
 * 
 * <p>============================================</p>
 * <p>Modification History
 * <p>Mender: </p>
 * <p>Date: </p>
 * <p>Reason: </p>
 * <p>============================================</p>
 */
public class UserService extends BaseService{

	private UsersMapper usersMapper;
	
	public UserService(){
		initMapper("usersMapper");
	}
	/**
	 * 是否有此用户
	 * @param user
	 * @return
	 */
	public int have(Users user){
		return usersMapper.have(user);
	}
	
	/**
	 * 根据登录名查询用户对象
	 * freeteam 2011-12-16
	 * @param loginName
	 * @return
	 */
	public Users findByLoginName(String loginName){
		UsersExample example=new UsersExample();
		Criteria criteria=example.createCriteria();
		criteria.andLoginnameEqualTo(loginName);
		List<Users> users=usersMapper.selectByExample(example);
		if (users!=null && users.size()>0) {
			return users.get(0);
		}
		return null;
	}
	/**
	 * 根据id查询
	 * @param id
	 * @return
	 */
	public Users findById(String id){
		return usersMapper.selectByPrimaryKey(id);
	}
	
	/**
	 * 保存
	 * freeteam 2011-12-17
	 * @param users
	 */
	public void save(Users users){
		usersMapper.insert(users);
		DBCommit();
	}
	/**
	 * 保存
	 * freeteam 2011-12-17
	 * @param users
	 */
	public void update(Users users){
		usersMapper.updateByPrimaryKey(users);
		DBCommit();
	}
	
	//setter and getter

	public UsersMapper getUsersMapper() {
		return usersMapper;
	}

	public void setUsersMapper(UsersMapper usersMapper) {
		this.usersMapper = usersMapper;
	}
}