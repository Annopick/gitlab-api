package com.ccb.js.gitlab.model;

public class User {
	private String email;
	private String password;
	private String reset_password;
	private String username;
	private String name;
	private String skype;
	private String linkedin;
	private String twitter;
	private String website_url;
	private String organization;
	private String projects_limit;
	private String extern_uid;
	private String provider;
	private String bio;
	private String location;
	private boolean admin;
	private boolean can_create_group;
	private boolean skip_confirmation;
	private String external;
	private String avatar;
	private String shared_runners_minutes_limit;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getReset_password() {
		return reset_password;
	}
	public void setReset_password(String reset_password) {
		this.reset_password = reset_password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSkype() {
		return skype;
	}
	public void setSkype(String skype) {
		this.skype = skype;
	}
	public String getLinkedin() {
		return linkedin;
	}
	public void setLinkedin(String linkedin) {
		this.linkedin = linkedin;
	}
	public String getTwitter() {
		return twitter;
	}
	public void setTwitter(String twitter) {
		this.twitter = twitter;
	}
	public String getWebsite_url() {
		return website_url;
	}
	public void setWebsite_url(String website_url) {
		this.website_url = website_url;
	}
	public String getOrganization() {
		return organization;
	}
	public void setOrganization(String organization) {
		this.organization = organization;
	}
	public String getProjects_limit() {
		return projects_limit;
	}
	public void setProjects_limit(String projects_limit) {
		this.projects_limit = projects_limit;
	}
	public String getExtern_uid() {
		return extern_uid;
	}
	public void setExtern_uid(String extern_uid) {
		this.extern_uid = extern_uid;
	}
	public String getProvider() {
		return provider;
	}
	public void setProvider(String provider) {
		this.provider = provider;
	}
	public String getBio() {
		return bio;
	}
	public void setBio(String bio) {
		this.bio = bio;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public boolean isAdmin() {
		return admin;
	}
	public void setAdmin(boolean admin) {
		this.admin = admin;
	}
	public boolean isCan_create_group() {
		return can_create_group;
	}
	public void setCan_create_group(boolean can_create_group) {
		this.can_create_group = can_create_group;
	}
	public boolean isSkip_confirmation() {
		return skip_confirmation;
	}
	public void setSkip_confirmation(boolean skip_confirmation) {
		this.skip_confirmation = skip_confirmation;
	}
	public String getExternal() {
		return external;
	}
	public void setExternal(String external) {
		this.external = external;
	}
	public String getAvatar() {
		return avatar;
	}
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}
	public String getShared_runners_minutes_limit() {
		return shared_runners_minutes_limit;
	}
	public void setShared_runners_minutes_limit(String shared_runners_minutes_limit) {
		this.shared_runners_minutes_limit = shared_runners_minutes_limit;
	}
	
	public boolean checkNotNull(User user) {
		if ("".equals(user.getEmail())) {
			return false;
		}
		else if ("".equals(user.getUsername())) {
			return false;
		}
		else if ("".equals(user.getName())) {
			return false;
		}
		else return true;
	}
}
