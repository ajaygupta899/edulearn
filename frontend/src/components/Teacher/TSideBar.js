import React, { useState } from "react";
import { Link } from "react-router-dom";
import "./TSidebar.css";

import { SideBarData } from "./TeachData";

const Sidebar = () => {
  const [selected, setSelected] = useState(0);

  return (
    <div className="Sidebars">
      <div className="Title">
        <span>Teacher Dashboard</span>
      </div>
      <div className="menu">
        {SideBarData.map((item, index) => {
          return (
            <div
              className={selected === index ? "menu-item active" : "menu-item"}
            >
              <Link to={item.URL}>
                {" "}
                <span>{item.heading}</span>
              </Link>
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
