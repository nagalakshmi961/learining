package com.CustomerDAO;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerImple  implements CustomerDAO{
	
	private DataSource dataSource;
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplate=new JdbcTemplate(dataSource);
	}

		public void insert(Customer cust) {
			int update=jdbcTemplate.update("insert into Customer values(?,?,?)",new Object[]
					  {cust.getCustid(),cust.getCustname(),cust.getAddress()}, new BeanPropertyRowMapper<Customer>(Customer.class));
		if(update>0)
		{  System.out.println("custm data inserted succesfully........");
			
		}
		}

}
