import React, { useState } from "react";
import { Link } from "react-router-dom";
import "./Sidebar.css";

import { SideBarData } from "./Data";

const Sidebar = () => {
  const [selected, setSelected] = useState(0);

  return (
    <div className="Sidebars">
      <div className="Title">
        <span>Student Dashboard</span>
      </div>
      {/*menu */}
      <div className="menu">
        {SideBarData.map((item, index) => {
          return (
            <div
              className={selected === index ? "menu-item active" : "menu-item"}
            >
              <span>{item.heading}</span>
              <Link to={item.URL}></Link>
            </div>
          );
        })}
        <div className="menu-item menu-item">
          <span>
            <button
              onClick={() => {
                localStorage.clear();
                window.location.href = "/";
              }}
            >
              Logout
            </button>
          </span>
        </div>
      </div>
    </div>
  );
};

export default Sidebar;
