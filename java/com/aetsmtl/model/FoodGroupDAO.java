package com.aetsmtl.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

@Component(value="foodGroupDAO")
public class FoodGroupDAO {

	private JdbcTemplate myJdbcTemplate ;
	
	public JdbcTemplate getMyJdbcTemplate() {
		return myJdbcTemplate;
	}

	@Autowired
	public void setMyJdbcTemplate(DataSource ds) {
		this.myJdbcTemplate = new JdbcTemplate(ds);
	}

	public List<FoodGroup> getFoodGroups(){
		return myJdbcTemplate.query("select * from foodgroups where name='Apple'", new RowMapper<FoodGroup>(){

			public FoodGroup mapRow(ResultSet rs, int RecNum) 
					throws SQLException {
				
				FoodGroup fg = new FoodGroup();
				fg.setIdfoodsgroup(rs.getInt("idfoodsgroups"));
				fg.setName(rs.getString("name"));
				fg.setDescription(rs.getString("description"));
				return fg;
			}
			
		});
	}
}
