package kr.ac.skuniv.springmvc.config;

import java.io.IOException;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kr.ac.skuniv.springmvc.mapper.Mapper;

@Configuration
@MapperScan(annotationClass=Mapper.class,basePackages="kr.ac.skuniv.springmvc.dao",sqlSessionFactoryRef="sqlSessionFactoryBean")//dao package에서 @mapper 달린 애 scan해서 인터페이스 구현
public class MybatisConfig {
	@Bean
	public SqlSessionFactoryBean sqlSessionFactoryBean(
			DataSource dataSource,ApplicationContext context
			) throws IOException{
		SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
		factoryBean.setDataSource(dataSource);
		factoryBean.setConfigLocation(context.getResource("classpath:mybatis/configuration.xml"));
		factoryBean.setMapperLocations(context.getResources("classpath:mybatis/mappers/**/*.xml")); //todomapper.xml로 가서 해당 id를 불러옴 ->TodoMapper로 id와 메서드(TodoMapper) 이름 동일해야함.
		factoryBean.setTypeAliasesPackage("com.lge.apip.mgmt.ocpo.policy.model");
		return factoryBean;
		
	}
	
	@Bean
	public SqlSessionTemplate sqlSession(SqlSessionFactory sqlSessionFactory) {
		return new SqlSessionTemplate(sqlSessionFactory);
	}
}
