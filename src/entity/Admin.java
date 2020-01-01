package entity;

public class Admin {
		private int adminId;
		private String adminName;
		private String adminPassword;
		public Admin() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Admin(int adminId, String adminName, String adminPassword) {
			super();
			this.adminId = adminId;
			this.adminName = adminName;
			this.adminPassword = adminPassword;
		}
		/**
		 * @return the adminId
		 */
		public int getAdminId() {
			return adminId;
		}
		/**
		 * @param adminId the adminId to set
		 */
		public void setAdminId(int adminId) {
			this.adminId = adminId;
		}
		/**
		 * @return the adminName
		 */
		public String getAdminName() {
			return adminName;
		}
		/**
		 * @param adminName the adminName to set
		 */
		public void setAdminName(String adminName) {
			this.adminName = adminName;
		}
		/**
		 * @return the adminPassword
		 */
		public String getAdminPassword() {
			return adminPassword;
		}
		/**
		 * @param adminPassword the adminPassword to set
		 */
		public void setAdminPassword(String adminPassword) {
			this.adminPassword = adminPassword;
		}
		/* (non-Javadoc)
		 * @see java.lang.Object#hashCode()
		 */
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + adminId;
			result = prime * result + ((adminName == null) ? 0 : adminName.hashCode());
			result = prime * result + ((adminPassword == null) ? 0 : adminPassword.hashCode());
			return result;
		}
		/* (non-Javadoc)
		 * @see java.lang.Object#equals(java.lang.Object)
		 */
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Admin other = (Admin) obj;
			if (adminId != other.adminId)
				return false;
			if (adminName == null) {
				if (other.adminName != null)
					return false;
			} else if (!adminName.equals(other.adminName))
				return false;
			if (adminPassword == null) {
				if (other.adminPassword != null)
					return false;
			} else if (!adminPassword.equals(other.adminPassword))
				return false;
			return true;
		}
		/* (non-Javadoc)
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			return "Admin [adminId=" + adminId + ", adminName=" + adminName + ", adminPassword=" + adminPassword + "]";
		}
		
}
