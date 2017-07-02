package com.tri.properties.global;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import com.tri.properties.model.Menu;
import com.tri.properties.model.Compiler;

@Component
@ConfigurationProperties("app")
public class AppProperties {

	private String error;
	private List<Menu> menus = new ArrayList<>();
	private Compiler compiler = new Compiler();

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public List<Menu> getMenus() {
		return menus;
	}

	public void setMenus(List<Menu> menus) {
		this.menus = menus;
	}

	public Compiler getCompiler() {
		return compiler;
	}

	public void setCompiler(Compiler compiler) {
		this.compiler = compiler;
	}

	@Override
	public String toString() {
		return "AppProperties [error=" + error + ", menus=" + menus + ", compiler=" + compiler + "]";
	}

}
