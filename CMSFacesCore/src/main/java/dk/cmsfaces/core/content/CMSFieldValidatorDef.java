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
/**
 * @brief Declares the interface of a JSF Validator definition. 
 * 
 * Validator definitions are used to map a content type to an Validator, 
 * that can validate the content of the associated type.
 * 
 */
public interface CMSFieldValidatorDef {
    //!\name Properties
    //@{
    public String getValidatorClass();
    public void setValidatorClass( String newClass );
    public String getMessage();
    public void setMessage( String newMessage );
    //@}
}
