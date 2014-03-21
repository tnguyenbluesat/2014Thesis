stk.v.10.0
WrittenBy    STK_v10.0.2

BEGIN Chain

Name  Chain3
BEGIN Definition

   Type        Chain
   Operator    Or
   Order       1
   Recompute   Yes
   IntervalType    0
   ComputeIntervalStart    0.000000
   ComputeIntervalStop     7300800.000000
    ComputeIntervalPtr
	BEGIN	EVENTINTERVAL
			BEGIN Interval
				Start	3 Dec 2013 01:00:00.000000000
				Stop	25 Feb 2014 13:00:00.000000000
			END Interval
			IntervalState	Explicit
	END	EVENTINTERVAL

   UseSaveIntervalFile    No
   UseMinAngle     No
   UseMaxAngle     No
   UseMinLinkTime     No
   LTDelayCriterion    2.000000
   TimeConvergence     0.005000
   AbsValueConvergence 1.000000e-014
   RelValueConvergence 1.000000e-008
   MaxTimeStep         360.000000
   MinTimeStep         1.000000e-002
   UseLightTimeDelay   Yes
    DetectEventsUsingSamplesOnly No
    Object  Aircraft/B747LAX_Heathrow/Transmitter/adsb_out6
    Object  Satellite/600km_p1_1/Receiver/adsb_satrcvr2
    Object  Satellite/600km_p1_1/Transmitter/Cubesat_ADSB_5W5
    Object  Facility/Heathrow/Receiver/ADSB_GndRcvr11
   SaveMode    1
BEGIN StrandAccesses

  Strand    Aircraft/B747LAX_Heathrow/Transmitter/adsb_out6 To Satellite/600km_p1_1/Receiver/adsb_satrcvr2 To Satellite/600km_p1_1/Transmitter/Cubesat_ADSB_5W5 To Facility/Heathrow/Receiver/ADSB_GndRcvr11
    Start    1096.0738252016197
    Stop     1862.0141815148697
    Start    7132.9597071614126
    Stop     7716.7657357899952
    Start    13141.266943639172
    Stop     13493.367344504932
    Start    19189.308269915095
    Stop     19284.182219234368
    Start    70135.62896475679
    Stop     70869.898254099564
    Start    76076.649244060609
    Stop     76829.941132664317
    Start    82125.485059982559
    Stop     82633.300618390145
    Start    88189.071349792124
    Stop     88394.260409496972
    Start    262363.16183542262
    Stop     262556.55943038565
    Start    268372.47220161685
    Stop     268785.09880270908
    Start    274409.13250305573
    Stop     274942.69169361563
    Start    337349.78125125135
    Stop     337835.52866256837
    Start    343415.81337014801
    Stop     344054.15759924869
    Start    349445.06023248757
    Stop     350247.02467520424
    Start    355453.42397019279
    Stop     356101.22439573618
    Start    361528.14353049203
    Stop     361846.5189356762
    Start    412690.30116130464
    Stop     413001.50391392276
    Start    418389.90503081452
    Stop     419194.76556807396
END StrandAccesses

   UseLoadIntervalFile    No

END Definition

BEGIN Extensions
    
    BEGIN Graphics

BEGIN Attributes

StaticColor					#ff00ff
AnimationColor					#ffff00
AnimationLineWidth					2.000000
StaticLineWidth					3.000000

END Attributes

BEGIN Graphics
    ShowGfx                Off
    ShowStatic             Off
    ShowAnimationHighlight On
    ShowAnimationLine      On
    ShowLinkDirection      Off
END Graphics
    END Graphics
    
    BEGIN ADFFileData
    END ADFFileData
    
    BEGIN Desc
    END Desc
    
    BEGIN Crdn
    END Crdn
    
    BEGIN VO
    END VO

END Extensions

END Chain

