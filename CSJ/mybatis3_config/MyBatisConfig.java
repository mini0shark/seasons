package testmy.config;

import java.io.IOException;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import testmy.mapper.Mapper;

@Configuration
@MapperScan(annotationClass = Mapper.class, basePackages = "testmy.dao", sqlSessionFactoryRef = "sqlSessionFactoryBean")
public class MyBatisConfig {

	@Bean
	public SqlSessionFactoryBean sqlSessionFactoryBean(DataSource dataSource, ApplicationContext applicationContext)
			throws IOException {
		SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
		factoryBean.setDataSource(dataSource);
		factoryBean.setConfigLocation(applicationContext.getResource("classpath:mybatis/configuration.xml"));
		factoryBean.setTypeAliasesPackage("com.lge.apip.mgmt.ocpo.policy.model");
		factoryBean.setMapperLocations(applicationContext.getResources("classpath:mybatis/mappers/**/*.xml"));
		return factoryBean;
	}

	@Bean
	public SqlSessionTemplate sqlSession(SqlSessionFactory sqlSessionFactory) {
		return new SqlSessionTemplate(sqlSessionFactory);
	}
}