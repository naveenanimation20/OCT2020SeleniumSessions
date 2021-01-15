package SeleniumSessions;

public enum DropDown {

	INDEX {
		@Override
		public String toString() {
			return "index";
		}
	},

	VALUE {
		@Override
		public String toString() {
			return "value";
		}
	},

	VISBLETEXT {
		@Override
		public String toString() {
			return "visibletext";
		}
	}

}
