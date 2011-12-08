//-----------------------------------------------------------------------------
/*
 * Copyright (C) 2011 sunepoulsen
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
//-----------------------------------------------------------------------------
package dk.cmsfaces.core.content;

//-----------------------------------------------------------------------------
import java.util.Map;

//-----------------------------------------------------------------------------
/**
 * @brief Declares the interface of a JSF UIComponent definition. 
 * 
 * UIComponent definitions are used to map a content type to an UIComponent, 
 * that can render contents of the associated type.
 * 
 */
public interface CMSUIComponentDef {
    //!\name Properties
    //@{
    public String getComponentName();
    public void setComponentName( String newName ) throws ClassNotFoundException;
    public Map<String, Object> getAttributtes();
    public void setAttributtes( Map<String, Object> newAttributtes );
    //@}
}

